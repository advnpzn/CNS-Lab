# Caesar Cipher

alphabet = "abcdefghijklmnopqrstuvwxyz"

def encrypt(string, key):
    string = string.lower()
    encString = ""
    for i in string:
        encString += ' ' if i == ' ' else alphabet[(alphabet.index(i) + 3) % 26]
    return encString

def decrypt(string, key):
    string = string.lower()
    decString = ""
    for i in string:
        decString += ' ' if i == ' ' else alphabet[(alphabet.index(i) - 3) % 26]
    return decString

print("Enter plain text : ")
t = input()
e = encrypt(t, 3)
print("Encrypted text : ", e)
d = decrypt(e, 3)
print("Decrypted text : ", d)
