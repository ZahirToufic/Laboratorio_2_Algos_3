KC=     kotlinc
KFLAG=  -cp

all:    SudokuKt.class

SudokuKt.class: Sudoku.kt
	$(KC) $(KFLAG) . Sudoku.kt

clean:
	rm -rf *.class META-INF

