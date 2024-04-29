package com.nsritz.jnocturn.util;

public enum TokenType {
    // Single Characters
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    SEMICOLON, COMMA, DOT, PLUS, MINUS, STAR, SLASH,

    // Single/Double Characrters
    BANG, BANG_EQUAL, EQUAL, EQUAL_EQUAL, GREATER,
    GREATER_EQUAL, LESS, LESS_EQUAL,

    // Literals
    IDENTIFIER, STRING, NUMBER,

    // Keywords
    AND, OR, TRUE, FALSE, FUNCT, CLASS, THIS, SUPER,
    RETURN, NULL, WHILE, FOR, IF, ELSE, VAR, PRINT,

    EOF
}
