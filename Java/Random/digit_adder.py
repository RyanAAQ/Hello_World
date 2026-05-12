def add(word):
    sums = 0
    for numbers in word:
        if numbers == '1' or numbers == '2' or numbers == '3' or numbers == '4' or numbers == '5' or numbers == '6' or numbers == '7' or numbers == '8' or numbers == '9':
            numbers = int(numbers)
            sums += numbers
           
    return sums
          
print(add('a1b2c3'))
