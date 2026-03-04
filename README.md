# Laboratorio 2 - Sudoku con Backtracking

**Nombre:** [Tu nombre]  
**Carnet:** [Tu carnet]

## Explicación de la implementación

Se utilizó la técnica de backtracking para resolver el Sudoku. La función principal `solveSudoku` recorre recursivamente el tablero buscando celdas vacías. Para cada celda vacía prueba números del 1 al 9, verificando con la función `isValid` que el número no esté repetido en la misma fila, columna o subcuadro de 3×3. Esta verificación actúa como **poda**, descartando rápidamente opciones inviables.

Si al colocar un número se logra completar el tablero (caso base sin celdas vacías), se retorna `true`. Si ninguna opción funciona, se retrocede (backtrack) y se prueba otro número.

El programa recibe la cadena de 81 caracteres como argumento de línea de comandos e imprime la solución en el mismo formato o la palabra `NOSOLUTION` si no existe solución.

## Condiciones de poda utilizadas
- Validación por fila, columna y región antes de colocar un número.
- No se implementaron heurísticas adicionales; la poda básica es suficiente para un tiempo de ejecución aceptable en sudokus de 9×9.
