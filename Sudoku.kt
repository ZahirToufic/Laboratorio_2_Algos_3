fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error: Debe proporcionar la cadena del Sudoku como argumento.")
        return
    }
    val input = args[0]
    if (input.length != 81) {
        println("Error: La cadena debe tener exactamente 81 caracteres.")
        return
    }

    // Convertir la cadena en una matriz 9x9
    val board = Array(9) { IntArray(9) }
    for (i in 0 until 81) {
        val row = i / 9
        val col = i % 9
        board[row][col] = input[i].digitToIntOrNull() ?: 0
    }

    if (solucionSudoku(board)) {
        // Imprimir la solución como una cadena continua
        val result = board.joinToString("") { row ->
            row.joinToString("")
        }
        println(result)
    } else {
        println("NOSOLUTION")
    }
}

/**
 * Resuelve el Sudoku mediante backtracking.
 * retorna true si se encontró una solución, false en caso contrario.
 */
fun solucionSudoku(board: Array<IntArray>): Boolean {
    for (row in 0 until 9) {
        for (col in 0 until 9) {
            if (board[row][col] == 0) { // Celda vacía encontrada
                for (num in 1..9) {
                    if (isValid(board, row, col, num)) {
                        board[row][col] = num
                        if (solucionSudoku(board)) {
                            return true
                        }
                        board[row][col] = 0 // Backtrack
                    }
                }
                return false // No se pudo colocar ningún número
            }
        }
    }
    return true // No hay más celdas vacías
}

/**
 * Verifica si colocar 'num' en la posición (row, col) es válido.
 */
fun isValid(board: Array<IntArray>, row: Int, col: Int, num: Int): Boolean {
    // Verificar fila
    for (c in 0 until 9) {
        if (board[row][c] == num) return false
    }
    // Verificar columna
    for (r in 0 until 9) {
        if (board[r][col] == num) return false
    }
    // Verificar subcuadro 3x3
    val startRow = (row / 3) * 3
    val startCol = (col / 3) * 3
    for (r in startRow until startRow + 3) {
        for (c in startCol until startCol + 3) {
            if (board[r][c] == num) return false
        }
    }
    return true
}
