# What does cminus-parser do? #

CMinus-Parser is a Lexer and Parser for CMinus files.

When you provide a CMinus file as an input, cminus-parser will first display the lexical tokens and then parses the content. Error reports for parse errors will be displayed based on how ANTLR is configured to show them.

# Run the jar #

To invoke the jar,

usage: java -jar cminus.jar [args](args.md) sample-file.cm

make sure **antlr-3.2.jar** is in your classpath.

example:
java -classpath lib/antlr-3.2.jar -jar cminus.jar ../samples/sample2.cm