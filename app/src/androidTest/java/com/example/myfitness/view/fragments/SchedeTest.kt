package com.example.myfitness.view.fragments

import androidx.recyclerview.widget.RecyclerView
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.*

import androidx.test.runner.AndroidJUnit4
import com.example.myfitness.view.fragments.ProfileFragment
import org.junit.Rule
import org.junit.runner.RunWith
import org.junit.Before
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.myfitness.R
import com.example.myfitness.view.activities.MainActivity
import com.example.myfitness.view.activities.StartActivity
import com.example.myfitness.view.fragments.LoginFragment
import org.junit.Test
import java.util.EnumSet.allOf


@RunWith(AndroidJUnit4::class)
class SchedeTest{
    @Rule @JvmField
    public val activityActivityTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setup() {
        activityActivityTestRule.activity
            .supportFragmentManager.beginTransaction().replace(
            R.id.container_main,
            SchedeFragment()
        ).addToBackStack(null).commit()
    }


    @Test
    fun testProfileCreaScheda() {
        onView(withId(R.id.fragment_schede)).check(matches((isDisplayed())))
        onView(withId(R.id.button_add_scheda)).check(matches((isDisplayed())))
        onView(withId(R.id.button_add_scheda)).perform(click())
        onView(withText("Crea scheda")).check(matches((isDisplayed())))
        onView(withText("Crea scheda")).perform(click())
        onView(withText("Crea scheda")).check(matches((isDisplayed())))
    }

    @Test
    fun testProfileRichiediScheda() {
        onView(withId(R.id.fragment_schede)).check(matches((isDisplayed())))
        onView(withId(R.id.button_add_scheda)).check(matches((isDisplayed())))
        onView(withId(R.id.button_add_scheda)).perform(click())
        onView(withText("Richiedi scheda")).check(matches((isDisplayed())))
        onView(withText("Richiedi scheda")).perform(click())
        onView(withText("Richiedi una scheda")).check(matches((isDisplayed())))
    }


}
