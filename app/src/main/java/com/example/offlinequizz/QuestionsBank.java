package com.example.offlinequizz;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> javaQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Which is a reserved word  in the java programing language?", "method" ,"native" ,"reference","array", "native","");
        final QuestionsList question2 = new QuestionsList("Which is the valid declarations within an interface definition?", "public double methoda();" ,"public final double methoda();" ,"static void methoda(double d1);","protected void methoda(double d1)", "public double methoda();","");
        final QuestionsList question3 = new QuestionsList("What is the size of int variable?","16 bit" ,"8 bit" ,"32 bit","64 bit", "32 bit","");
        final QuestionsList question4 = new QuestionsList("What is the default value of Boolean variable?", "true" ,"false" ,"null","not defined", "false","");
        final QuestionsList question5 = new QuestionsList("What of the following is the default value of an instance variable?", "Depends upon the type of variable" ,"null" ,"0","not assigned", "Depends upon the type of variable","");
        final QuestionsList question6 = new QuestionsList("Which of the following is NOT a keywords or reserved words in java?", "if" ,"then" ,"goto","while", "then","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> phpQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What does PHP stand for?","Professional Home Page" ,"Hypertext Preprecessor" ,"Pretext Hypertext Processor","Preprocessor Home Page", "Hypertext Preprecessor","");
        final QuestionsList question2 = new QuestionsList("Who is the father of PHP?", "Reasmus Lerdorf" ,"Willam Makepiece" ,"Drek Kolkevi","List Barely", "Reasmus Lerdorf","");
        final QuestionsList question3 = new QuestionsList("PHP files have a default file extension of?", ".html" ,".php" ,".xml",".json", ".php","");
        final QuestionsList question4 = new QuestionsList("A PHP script should start with ___ and end with ____?", "< php >" ,"< php />" ,"< ? ? >","< ?php ? >", "native","");
        final QuestionsList question5 = new QuestionsList("Which version of PHP introduced try/catch Exception?", "PHP 4" ,"PHP 5" ,"PHP 6","PHP 5.3", "PHP 5","");
        final QuestionsList question6 = new QuestionsList("If $a = 12 what will be returned when ($a == 12) ? 5 : 1 is executed?", "12" ,"1" ,"5","error", "5","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> htmlQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("From which tag descriptive list starts?", "<LL>>" ,"<DD>" ,"<DL>","<DS>", ".<DL>","");
        final QuestionsList question2 = new QuestionsList("Markup tags tell the web browser?", "How to organise the page" ,"How to display the page" ,"How to display message box on page","None if these", "How to display the page","");
        final QuestionsList question3 = new QuestionsList("Correct HTML tag for the largest heading is", "<head>" ,"<large>" ,"<h6>","<heading>", "h1","");
        final QuestionsList question4 = new QuestionsList("Which of the following tag is used to mark a begining of paragraph?", "<TD>" ,"<br>" ,"<P>","<TR>>", "<P>","");
        final QuestionsList question5 = new QuestionsList("the attribute of <form> tag", "Method" ,"Action" ,"Both (a)&(b)","None if these", "Both (a)&(b)","");
        final QuestionsList question6 = new QuestionsList("HTML stands for?","Hyper Text Markup Language" ,"High Text Markup Language" ,"Hyper Tabular Markup Language","None if these", "Hyper Text Markup Language","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> androidQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Select a component which is NOT part of Android architecture","Android Framworke" ,"Libraries" ,"Linux kernel","Android Document", "Linux kernel","");
        final QuestionsList question2 = new QuestionsList("A _______ Makes a specific set of the application data available to other applications", "Content provider" ,"Broadcast receivers" ,"Intent","None of these", "Content provider","");
        final QuestionsList question3 = new QuestionsList("Which among these are NOT a part of Android's native libraries?", "Webkit" ,"Dalvik" ,"OpenGL","SQLite", "Dalvik","");
        final QuestionsList question4 = new QuestionsList("During an Activity life-cycle,What is the first calback method invoked by the system?", "onStop()" ,"onStart()" ,"onCreate()","onRestore", "onCreate()","");
        final QuestionsList question5 = new QuestionsList("What Activity method you use to retrieve to an Android view by using the id attribute of a resource XML??", "findViewByReference(int id);" ,"findViewById(int id);" ,"findViewById(String id);","retrieveResourceById(int id);", "findViewById(int id);","");
        final QuestionsList question6 = new QuestionsList("The requests from Content Provider class is handled by method", "onCreate" ,"onSelect" ,"ContentResolver","onClick", "ContentResolver","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }

}
