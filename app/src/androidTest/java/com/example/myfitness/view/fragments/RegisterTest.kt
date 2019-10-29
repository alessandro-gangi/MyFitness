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
class RegisterTest{
    @Rule @JvmField
    public val activityActivityTestRule: ActivityTestRule<StartActivity> = ActivityTestRule(StartActivity::class.java)

    @Before
    fun setup() {
        activityActivityTestRule.activity
            .supportFragmentManager.beginTransaction().replace(
            R.id.container_start,
            RegisterFragment()
        ).addToBackStack(null).commit()
    }

    @Test
    fun testRegisterMail() {
        onView(withId(R.id.mail_register_editText)).check(matches((isDisplayed())))
        onView(withId(R.id.mail_register_editText)).perform(clearText(),typeText("Testing mail"))
    }

    @Test
    fun testRegisterUsername() {
        onView(withId(R.id.username_register_editText)).check(matches((isDisplayed())))
        onView(withId(R.id.username_register_editText)).perform(clearText(),typeText("Testing username"))
    }

    @Test
    fun testRegisterPassword() {
        onView(withId(R.id.password_register_editText)).check(matches((isDisplayed())))
        onView(withId(R.id.password_register_editText)).perform(clearText(),typeText("Testing password"))
    }

    @Test
    fun testRegisterSwitchToLogin() {
        onView(withId(R.id.switch_to_login_textView)).check(matches((isDisplayed())))
        onView(withId(R.id.switch_to_login_textView)).perform(click())
        onView(withId(R.id.fragment_login)).check(matches((isDisplayed())))
    }
}
