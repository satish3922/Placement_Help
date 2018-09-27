def minion_game(string):
    # your code goes here
    string = list(string)
    vowels = 'AEIOU'
    consonant = []
    vowel = []
    newC = []
    for i in string:
        while string.count(i)!=1:
            if string.count(i) > 1:
                string.remove(i)
    for i in string:
        if i in vowels:
            vowel.append(i)
        else:
            consonant.append(i)
    for j in consonant:
        for i in range(len(string)):
            if j in string:
                sep = ''
                s = string[:i]
                st = sep.join(s)
            newC.append(st)

    # for i in range(len(consonant)):
    #     for j in range(len(string)):
    #         if consonant[i] in string[j]:
    #             count_cons += 1

    return vowel,consonant,newC
string = 'BANANA'
print(minion_game(string))
