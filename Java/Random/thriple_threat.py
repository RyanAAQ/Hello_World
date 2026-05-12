def triple(word):
    char = ""
    for letters in word:
        for _ in range(3):
            char += letters
            
    return char
    
print(triple("code"))    
            
        
