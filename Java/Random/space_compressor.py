def spaces(word):
    spaces = ""
    for letters in word:
        if letters == " ":
            letters = "-"
        spaces += letters
        
    return spaces
     
print(spaces("bl ah"))
