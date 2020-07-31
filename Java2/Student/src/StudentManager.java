
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khai2
 */
public class StudentManager {
    static Scanner sc = new Scanner(System.in);
    private List<Student> StudentList;
    private StudentDao StudentDao;
    
    public StudentManager() {
        StudentDao = new StudentDao();
        StudentList = new ArrayList<>();
    } 
}
