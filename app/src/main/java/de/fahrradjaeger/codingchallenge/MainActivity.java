package de.fahrradjaeger.codingchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*

 Implement the todos in this coding exercise together with your interview partners. Do get nervous, you do not need to
 implement every task. Work together with your interviewers, think aloud and ask question in case the task ist not clear.

 We start by implementing a new activity.

  TODO 1.1 Add a new "detail" activity, do not use the Android Studio Wizard.
  TODO 1.2 Register the new activity in the manifest, it's not a launcher activity.
  TODO 1.3 Add a layout for the new activity. Place a text view. The text view will display a string supplied to the activity.
  TODO 1.4 Add a new button to the MainActivity that launches the new activity and displays the string "Hello, insect!".

  Now, implement a list view of some strings on the main activity. Clicking a list item will open the detail activity
  and display the string.

  TODO 2.1 Add a list to the main activity's code and layout. Remove the button
  TODO 2.2 Register a click listener on the items that launches the detail activity and displays the items string

 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
