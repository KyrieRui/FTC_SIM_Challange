// 定义一个类
class Animal {
    // 属性
    private String name;
    private int age;
    
    // 构造方法
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // 方法
    public void makeSound() {
        System.out.println("Some sound...");
    }
    
    // 获取名称的方法
    public String getName() {
        return name;
    }
    
    // 获取年龄的方法
    public int getAge() {
        return age;
    }
}