def get_vowels(words):
    vowel = []
    vowels = ['a', 'e', 'i', 'o', 'u']
    
    for letter in words.lower():
        if letter in vowels and letter not in vowel:
            vowel.append(letter)
     
    return len(vowel)

word = "pineapple"
print("The amount of vowels =", get_vowels(word))
        
