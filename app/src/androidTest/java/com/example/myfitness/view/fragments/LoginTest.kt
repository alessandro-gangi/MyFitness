package com.example.myfitness.view.fragments

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
import com.example.myfitness.view.activities.StartActivity
import com.example.myfitness.view.fragments.LoginFragment
import org.junit.Test
import java.util.EnumSet.allOf


@RunWith(AndroidJUnit4::class)
class LoginTest{
    @Rule @JvmField
    public val activityActivityTestRule: ActivityTestRule<StartActivity> = ActivityTestRule(StartActivity::class.java)

    @Before
    fun setup() {
        activityActivityTestRule.activity
            .supportFragmentManager.beginTransaction().replace(
            R.id.container_start,
            LoginFragment()
        ).addToBackStack(null).commit()
    }


    @Test
    fun testLoginUsername() {
        onView(withId(R.id.username_login_editText)).check(matches((isDisplayed())))
        onView(withId(R.id.username_login_editText)).perform(clearText(),typeText("Testing user"))
    }

    @Test
    fun testLoginPassword() {
        onView(withId(R.id.password_login_editText)).check(matches((isDisplayed())))
        onView(withId(R.id.password_login_editText)).perform(clearText(),typeText("Testing_pwd"))
    }

    @Test
    fun testLoginSwitchToRegister() {
        onView(withId(R.id.switch_to_register_textView)).check(matches((isDisplayed())))
        onView(withId(R.id.switch_to_register_textView)).perform(click())
        onView(withId(R.id.fragment_register)).check(matches((isDisplayed())))
    }

}
