# cminus-parser
Parser and Lexer for C Minus language. The Parser and Lexer is written in ANTLR. Generates the java code.

For a CMinus file provided as an input, cminus-parser will first display the lexical tokens.Then, it parses the content. Error reports for parse errors will be displayed based on how ANTLR is configured to show them.
Run the jar

To invoke the jar,

usage: java -jar cminus.jar [args] sample-file.cm

make sure antlr-3.2.jar is in your classpath.

example: java -classpath lib/antlr-3.2.jar -jar cminus.jar ../samples/sample2.cm 

- Automatically exported from code.google.com/p/cminus-parser
