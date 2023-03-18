package org.example;
import entities.menu.Menu;


/**
 * Task management application:
 * The application should allow users to interact with it via a console-based interface.
 * Users should be able to create and manage tasks by entering task details such as title, description, and due date. They should also be able to assign them to different projects.
 * Users should be able to view, update, and delete tasks by entering the task title, and mark them as complete.
 * The application should allow users to view the progress of different projects and see which tasks are still pending and which are completed by entering the project name.
 * Users should be able to set due dates for tasks and receive reminders when a task is coming due.
 * Admins should be able to manage user accounts via the console interface.
 * The application should use Hibernate to interact with a PostgresSQL database to store and retrieve information about tasks, projects, and users.
 * Object-oriented principles should be used to model the tasks, projects, and users within the system.
 * Collections can be used to store the tasks and projects.
 * Design patterns can be used to implement the overall architecture of the system.
 *
 * Authors:  Marko Piir, Joosep Sebastian Podelsky, Sander Hintsov, Sergei Oksanen,  Karl-Erik Sirkas, Mahmut Bahadır Taşlı.
 */

public class Main {
    public static void main(String[] args) {

        Menu.chooseAccount();

//        Timer timer = new Timer();
//
//        TimerTask task = new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("Check due date if method here");
//            }
//        };
//
//        Calendar date = Calendar.getInstance();
//        date.set(Calendar.HOUR,12);
//        date.set(Calendar.MINUTE, 0);
//        date.set(Calendar.SECOND,0);
//
//       // timer.schedule(task, 1000);
//        timer.schedule(task, date.getTime());
    }
}