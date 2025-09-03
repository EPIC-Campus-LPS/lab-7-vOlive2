

# Lab 7 
## Part 1 

In this part, you will create the class `Crypto` that has two methods, `encrypt` and `decrypt`. `encrypt` takes two arguments: a string representing a message to encrypt and an integer representing how many letters to shift the message to the right. For example, a shift of 7 would turn a into h, b into i, and c into j, etc. This method of encryption is also known as a Caesar cipher.  `decrpyt` also takes two arguments: a string representing a message to decrypt and an integer representing how many letters to shift the message to the left. For example, a shift of 7 would turn h into a, i into b, and j into c, etc. Both methods should return the message after it has been encrypted/decrypted. 

To test your functions, create a class `CryptoRunner` with the following main.
```java
public static void main(String[] args){
	String message = "Hello, how are you?";
	System.out.println(message); // Prints "Hello, how are you?"
	
	String encoded = Crypto.encrypt(message, 7);
	System.out.println(encoded); // Prints "Olssv, ovd hyl fvb?"
	
	String decoded = Crypto.decrypt(encoded, );
	System.out.println(decoded); // Prints "Hello, how are you?"
}
```

## Part 2

In this part, you will create the class `Fraction`. `Fraction` has two private instance variables `numerator` and `denominator` represented as integers. 

`Fraction` has three constructors.
- The default constructor which initializes the fraction 0/1
- A constructor with one parameter `n` which initializes the fraction `n`/1
- A constructor with two parameters `n` and `d` which initializes the fraction `n`/`d`

`Fraction` has 4 methods.
- `toDecimal()` - returns the fraction as a decimal value
- `simplify()` - returns a new `Fraction` object representing a simplified version of the fraction
- `toString()` - overrides `toString()` from `Object` and returns a string with the fraction written "numerator/denominator". When you print out a `Fraction`, now it should be written correctly instead of showing the memory address
- `equals(Fraction f)` - overrides `equals()` from `Object` and returns true if the fraction and `f` are equivalent fractions.

To test, create a new class `FractionRunner` with the following main. 
```java
public static void main(String[] args){
	Fraaction f = new Fraction(10,400);
	
	System.out.println(f); // 10/400
	
	double d = f.toDecimal();
	System.out.println(d); // 0.025
	
	Fraction f2 = f.simplify();
	System.out.println(f2); // 1/40
	
	System.out.println(f.equals(f2)); // True
	
}
```

## Part 3

In this part, you will read in a list of email addresses from a file, and print out their usernames with a random password to the console. 

The input file `emails.txt`. 
```
alex.jordan42@example.com
samantha.test123@fakemail.net
dev.team.demo@placeholder.org
```

Could produce the output: 
```
alex.jordan42, hrhwuph452h
samantha.test123, lsjdfjiru7
dev.team.demo, a2348lkdsfh
```


emails.txt
```
jason.miller82@example.com
luna.star99@fakemail.net
devteam.alpha@placeholder.org
sarah.connor77@testmail.com
ryan.dev42@mockup.net
emma.writes2025@example.org
harry.potter123@demoemail.com
linda.green88@fakesite.net
alex.techlab@placeholder.io
mark.jones55@testbox.org
sophie.sunrise@trymail.net
kevin.carter2024@demo.org
zoe.smith44@mockmail.com
oliver.lee@samplemail.net
mia.rose91@fakeservice.org
jackson.hughes@mydemo.net
nina.cloud87@testsite.org
daniel.kim77@placeholder.com
lucas.night12@demoemail.net
ava.stone@testaccount.org
ethan.cole88@fakemail.org
chloe.davis99@tempmail.net
matthew.woods77@demo.org
sophia.lake55@example.net
benjamin.rivers@mockup.org
```
