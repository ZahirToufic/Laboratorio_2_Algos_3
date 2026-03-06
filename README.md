# Laboratorio 2 - Sudoku con Backtracking

Nombre: Zahir Saad
Carnet: 21-10600

## Explicación de la implementación

Se utilizó la técnica de backtracking para resolver el Sudoku. La función principal 'solucionSudoku' recorre recursivamente el tablero buscando celdas vacías. Para cada celda vacía prueba números del 1 al 9, verificando con la función 'isValid' que el número no esté repetido en la misma fila, columna o subcuadro de 3×3. Esta verificación actúa como **poda**, descartando rápidamente opciones inviables.

Si al colocar un número se logra completar el tablero (caso base sin celdas vacías), se retorna `true`. Si ninguna opción funciona, se retrocede (backtrack) y se prueba otro número.

El programa recibe la cadena de 81 caracteres como argumento de línea de comandos e imprime la solución en el mismo formato o la palabra `NOSOLUTION` si no existe solución.

## Condiciones de poda utilizadas
- Validación por fila, columna y región antes de colocar un número.
- No se implementaron heurísticas adicionales; la poda básica es suficiente para un tiempo de ejecución aceptable en sudokus de 9×9.

## Requisitos y ejecucion

1) Tener instalado kotlin y java JDK.
2) Haber descargado y descomprimido el archivo .zip que contiene el codigo, makefile, bash y archivo txt para poder ejecutarlo correctamente.
3) Abrir la terminal.
4) Usar el comando cd para direccioanarnos hacia la ubicacion de la carpeta que contiene el programa.
5) Compilar: ejecute make en su terminal.
6) Ejecutar una prueba: dé acceso a runSudoku.sh con chmod +x runSudoku.sh, finalmente ejecute ./runSudokush [String con 81 numeros]. Por ejemplo: escribir "./runSudoku.sh 530070000600195000098000060800060003400803001700020006060000280000419005000080079" en la terminal lo cual retornara 534678912672195348198342567859761423426853791713924856961537284287419635345286179.
