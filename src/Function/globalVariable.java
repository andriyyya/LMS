package Function;

import Entity.Staff;
import Entity.Student;
import LinkedList.DoublyLinkList;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.TableView;

import java.util.ArrayList;
import java.util.List;

public class globalVariable {

    public static Function fnc = new Function();
    public static dbFunction dbFnc = new dbFunction();
    public static Student loginStudent;

    public static Group cabinets = new Group();
    public static DoublyLinkList bookList = new DoublyLinkList();

    public static void refresh() {  //Refreshes the book in the bookList

    }

    public static ArrayList<Staff> sortedStaffListASC = new ArrayList<>();
    public static ArrayList<Staff> sortedStaffListDESC = new ArrayList<>();
    public static ArrayList<Student> sortedStudentListASC = new ArrayList<>();




}
