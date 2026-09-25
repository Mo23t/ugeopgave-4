import java.util.ArrayList;
public class Ugeopgave4 {

        public static void main(String[] args) {
           /*
            Student student = new Student("Mo", 23);

            Student student1 = new Student("Mahdi", 23);

            Student student2 = new Student("Anna ", 23);

            Student student3 = new Student("Bob", 44);

            ArrayList<Student> students = new ArrayList<Student>();
            students.add(student);
            students.add(student1);
            students.add(student2);
            students.add(student3);
            int studentsize = students.size();

            for (Student s : students) {
                System.out.println(s);

            }

            Student oldest = students.get(0);

            for (Student s : students) {
                if (s.age > oldest.age) {
                    oldest = s;
                }
            }

            System.out.println("Den ældste er: " + oldest.name + " - " + oldest.age + " år");

          */








            Produkter p = new Produkter("Sko",200,
                    new String[]{"nike", "adidas","rebook","masion margiela"});
            System.out.println(p.name);
            System.out.println(p.price);
            for(String x: p.tags){
                System.out.println(x);



            }
            Produkter p1= new Produkter("Laptop",10000,
                    new String[]{"electronics", "new"});
            Produkter p2= new Produkter("TV",1000,
                    new String[]{"electronics", "sale"});
            Produkter p3= new Produkter("Playstion",9000,
                    new String[]{"electronics", "new"});
            Produkter p4= new Produkter("Watch",130000,
                    new String[]{"electronics", "sale"});

            ArrayList<Produkter> produkters = new ArrayList<Produkter>();
            produkters.add(p1);
            produkters.add(p2);
            produkters.add(p3);
            produkters.add(p4);
            int produkterssize = produkters.size();
            for (Produkter x : produkters) {
                if (x.hastag("sale")){
                    System.out.println(x);
                }
            }
            Produkter dyreste = produkters.get(0);

            for (Produkter x : produkters) {
                if (x.price > dyreste.price) {
                    dyreste = x;
                }
            }
            System.out.println(p.hastag("nike"));
            System.out.println("Dyreste produkt:");
            System.out.println(dyreste);






        }
}
