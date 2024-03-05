package me.gamercoder215.calcgames.levelz.idea;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.psi.SimpleTypes;
import com.intellij.psi.TokenType;

%%

%class LevelZLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

HEADER=@[A-z]*
END=end
CRLF=\n|\r|\r\n
WHITE_SPACE=\s

%state WAITING_VALUE

%%

<YYINITIAL> {
    {HEADER} {
        return LevelZTypes.HEADER;
    }
}

<TYPES> {
    {END} {
        return LevelZTypes.END;
    }
}