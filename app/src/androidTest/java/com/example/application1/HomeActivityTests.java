package com.example.application1;

import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.annotation.ContentView;
import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import com.example.application1.app.HomeActivity;

public class HomeActivityTests {
    var mActivityScenerioRule = ActivityScenarioRule(HomeActivity::class.java)

    fun logicTest(){
        onView(withId(R.id.etUi))
                .perform(typeText)
    }
}
