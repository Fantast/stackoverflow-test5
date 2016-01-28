lexer grammar TestLexer;

LBR: '[';
RBR: ']';
KEY
: [a-zA-Z\u0160\u0161\u00C0-\u00FF][a-zA-Z_0-9\-\''\u0160\u0161\u00C0-\u00FF]*
;