package firstjavaproject;

public class t1 {

}class Main {
    public static void main(String[] args) {
        Student student = new Student("Juan", "Pérez", "123456");
        Teacher teacher = new Teacher("Ana", "García", "7891011");
        Director director = new Director("Pedro", "Sánchez", "12131415");
        Admin admin = new Admin("María", "Martínez", "16171819");
        
        student.enroll();
        teacher.teach();
        director.manage();
        admin.process();
    }
}

class Student {
    String name;
    String lastName;
    String id;
    
    public Student(String name, String lastName, String id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }
    
    public void enroll() {
        System.out.println("Enrolling student " + name + " " + lastName + " with ID " + id);
    }
    
    public void attend() {
        System.out.println("Student " + name + " " + lastName + " is attending class");
    }
    
    public void grade() {
        System.out.println("Student " + name + " " + lastName + " has received a grade");
    }
}

class Teacher {
    String name;
    String lastName;
    String id;
    
    public Teacher(String name, String lastName, String id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }
    
    public void teach() {
        System.out.println("Teacher " + name + " " + lastName + " is teaching class");
    }
    
    public void grade() {
        System.out.println("Teacher " + name + " " + lastName + " is grading student's assignments");
    }
    
    public void advise() {
        System.out.println("Teacher " + name + " " + lastName + " is advising a student");
    }
}

class Director {
    String name;
    String lastName;
    String id;
    
    public Director(String name, String lastName, String id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }
    
    public void manage() {
        System.out.println("Director " + name + " " + lastName + " is managing the school");
    }
    
    public void approve() {
        System.out.println("Director " + name + " " + lastName + " is approving a request");
    }
    
    public void budget() {
        System.out.println("Director " + name + " " + lastName + " is reviewing the school's budget");
    }
}

class Admin {
    String name;
    String lastName;
    String id;
    
    public Admin(String name, String last
    		class Person {
        String name;
        String lastName;
        String id;
        
        public Person(String name, String lastName, String id) {
            this.name = name;
            this.lastName = lastName;
            this.id = id;
        }
    }

    class Student extends Person {
        public Student(String name, String lastName, String id) {
            super(name, lastName, id);
        }
        
        public void enroll() {
            System.out.println("Enrolling student " + name + " " + lastName + " with ID " + id);
        }
        
        public void attend() {
            System.out.println("Student " + name + " " + lastName + " is attending class");
        }
        
        public void grade() {
            System.out.println("Student " + name + " " + lastName + " has received a grade");
        }
    }

    class Teacher extends Person {
        public Teacher(String name, String lastName, String id) {
            super(name, lastName, id);
        }
        
        public void teach() {
            System.out.println("Teacher " + name + " " + lastName + " is teaching class");
        }
        
        public void grade() {
            System.out.println("Teacher " + name + " " + lastName + " is grading student's assignments");
        }
        
        public void advise() {
            System.out.println("Teacher " + name + " " + lastName + " is advising a student");
        }
    }

    class Director extends Person {
        public Director(String name, String lastName, String id) {
            super(name, lastName, id);
        }
        
        public void manage() {
            System.out.println("Director " + name + " " + lastName + " is managing the school");
        }
        
        public void approve() {
            System.out.println("Director " + name + " " + lastName + " is approving a request");
        }
        
        public void budget() {
            System.out.println("Director " + name + " " + lastName + " is reviewing the school's budget");
        }
    }

    class Admin extends Person {
        public Admin(String name, String lastName, String id) {
            super(name, lastName, id);
        }
        
        public void process() {
            System.out.println("Admin " + name + " " + lastName + " is processing paperwork");
        }
        
        public void register() {
            System.out.println("Admin " + name + " " + lastName + " is registering a student");
        }
        
        public void schedule() {
            System.out.println("Admin " + name + " " + lastName + " is scheduling an event");
        }
    }

    class Subject {
        String name;
        String code;
        String teacherName;
        
        public Subject(String name, String code, String teacherName) {
            this.name = name;
            this.code = code;
            this.teacherName = teacherName;
        }
        
        public void displayInfo() {
            System.out
            interface Worker {
                double getPayment();
                default void clockIn() {
                    System.out.println(name + " " + lastName + " has clocked in.");
                }
            }

            class Student extends Person implements Worker {
                public Student(String name, String lastName, String id) {
                    super(name, lastName, id);
                }
                
                public double getPayment() {
                    return 0; // students do not receive payment
                }
                
                public void enroll() {
                    System.out.println("Enrolling student " + name + " " + lastName + " with ID " + id);
                }
                
                public void attend() {
                    System.out.println("Student " + name + " " + lastName + " is attending class");
                }
                
                public void grade() {
                    System.out.println("Student " + name + " " + lastName + " has received a grade");
                }
            }

            class Teacher extends Person implements Worker {
                double salary;
                
                public Teacher(String name, String lastName, String id, double salary) {
                    super(name, lastName, id);
                    this.salary = salary;
                }
                
                public double getPayment() {
                    return salary;
                }
                
                public void teach() {
                    System.out.println("Teacher " + name + " " + lastName + " is teaching class");
                }
                
                public void grade() {
                    System.out.println("Teacher " + name + " " + lastName + " is grading student's assignments");
                }
                
                public void advise() {
                    System.out.println("Teacher " + name + " " + lastName + " is advising a student");
                }
            }

            class Director extends Person implements Worker {
                double salary;
                
                public Director(String name, String lastName, String id, double salary) {
                    super(name, lastName, id);
                    this.salary = salary;
                }
                
                public double getPayment() {
                    return salary;
                }
                
                public void manage() {
                    System.out.println("Director " + name + " " + lastName + " is managing the school");
                }
                
                public void approve() {
                    System.out.println("Director " + name + " " + lastName + " is approving a request");
                }
                
                public void budget() {
                    System.out.println("Director " + name + " " + lastName + " is reviewing the school's budget");
                }
            }

            class Admin extends Person implements Worker {
                double salary;
                
                public Admin(String name, String lastName, String id, double salary) {
                    super(name, lastName, id);
                    this.salary = salary;
                }
                
                public double getPayment() {
                    return salary;
                }
                
                public void process() {
                    System.out.println("Admin " + name + " " + lastName + " is processing paperwork");
                }
                
                public void register() {
                    System.out.println("Admin " + name + " " + lastName + " is registering a student");

