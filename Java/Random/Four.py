def vowels(word):
    return sum(1 for words in word.lower() if words in "aeiou")
    
print(vowels("beans"))
