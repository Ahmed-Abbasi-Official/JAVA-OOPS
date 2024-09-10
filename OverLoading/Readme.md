### Overloading ke Key Points:

1. **Method signature ka difference:**  
   Method ka naam same hota hai, lekin parameters ka number, type, ya order alag hota hai.

2. **Return type se farq nahi padta:**  
   Sirf return type change karne se method overloading nahi hoti; arguments ka difference zaroori hota hai.

3. **Compile-time polymorphism:**  
   Java compile-time pe decide karta hai ki kaunsa method execute hoga, based on the arguments.

---

### Overriding ke Key Points:

1. **Same method signature:**  
   Method ka naam, return type, aur parameters exactly same hone chahiye jo parent class me defined hain.

2. **Inheritance:**  
   Overriding tabhi possible hai jab ek class doosri class se inherit karti hai (extends keyword ka use karti hai).

3. **Run-time polymorphism:**  
   Overriding run-time polymorphism ka example hai, jisme Java run-time pe decide karta hai ki kaunse class ka method call hoga, based on the object.

4. **@Override annotation:**  
   Yeh annotation use kiya jata hai to specify that this method is overriding a method in the parent class.

---

### Overloading aur Overriding mein Fark:

1. **Overloading:**  
   Ek hi class ke andar methods ka naam same hota hai lekin parameters different hote hain.

2. **Overriding:**  
   Child class parent class ke method ko apne implementation ke saath redefine karta hai.
