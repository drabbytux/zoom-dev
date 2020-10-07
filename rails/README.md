# Ruby Language cheatsheet

## Strings

### Common transposing/casting
"string".upcase
> Uppercase text

"string".downcase
> Lowercase text

"string".to_i
> cast the string to an integer


### Find and Replace
"string".include? "substring"
> boolean if substring/char is found

"string".gsub!(/s/, "th")
> Stands for Global SUBstitution. Here we're regexing an s char and replacing them with a "th" string.