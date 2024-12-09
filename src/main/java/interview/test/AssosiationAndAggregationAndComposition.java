package interview.test;

class Department{
    String name;
    int id;
    public Department(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Book{
    String name;
    int id;
    public Book(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Library{
    Book[] books;
    public Library(Book[] books) {
       this.books = books;
    }

    public void print() {
        for (Book book : books) {
            System.out.println(book.name + " " + book.id);
        }
    }
}

class Employee{
    Department department;
    String name;

    public Employee(Department department, String name){
        this.department = department;
        this.name = name;
    }

    public void print(){
        System.out.println("Employee name: " + name+ " Working in department: " + department.name);
    }

}


public class AssosiationAndAggregationAndComposition {
    public static void main(String[] args) {
        Department department = new Department("HR",1);
        Employee employee1 = new Employee(new Department("HR",2),"Alok");
        employee1.print();



        Book book1 = new Book("math",1);
        Book book2 = new Book("hindi",2);
        Book book3 = new Book("physics",3);
        Book book4 = new Book("since",4);
        Book book5 = new Book("Art",5);

        Book book6 = new Book("Computer Science",6);
        Library library = new Library(new Book[]{book1,book2,book3,book4,book5});
        library.print();
    }
}
