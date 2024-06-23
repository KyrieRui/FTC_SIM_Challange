// 定义一个子类
class Dog extends Animal {
    // 构造方法
    public Dog(String name, int age) {
        super(name, age); // 调用父类的构造方法
    }
    
    // 重写父类的方法
    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
}