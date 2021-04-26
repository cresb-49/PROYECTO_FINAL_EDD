#! /bin/bash
echo "\n---------COMPILANDO ARCHIVO JFLEX-----\n"
cd Lexer/
java -jar jflex-full-1.8.2.jar lexer.jflex
rm Lexer.java~
echo "\n-------COMPILANDO ARCHIVO CUP-------\n"
cd ..
cd Parser/
cup parser.cup
echo "\n---------FIN DE ACCIONES---------\n"