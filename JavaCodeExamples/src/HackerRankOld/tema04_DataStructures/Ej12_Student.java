package tema04_DataStructures;

public class Ej12_Student implements Comparable<Ej12_Student>{
	private int id;
    private String fname;
    private double cgpa;
    public Ej12_Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
   
    public int getId() {
    	return id;
    }
   
    public String getFname() {
    	return fname;
    }
    public double getCgpa() {
    	return cgpa;
    }

	@Override
	public int compareTo(Ej12_Student o) {
		// TODO Auto-generated method stub
		if(cgpa==o.cgpa){
            if(fname.equals(o.fname)){
                return id-o.id;
            }else{
                return fname.compareTo(o.fname);
            }
        }else{
            if(o.cgpa-cgpa>0)
                return 1;
            else 
                return -1;
        }
	}
}
