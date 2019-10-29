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
import com.example.myfitness.view.activities.MainActivity
import com.example.myfitness.view.activities.StartActivity
import com.example.myfitness.view.fragments.LoginFragment
import org.junit.Test
import java.util.EnumSet.allOf


@RunWith(AndroidJUnit4::class)
class ProfileTest{
    @Rule @JvmField
    public val activityActivityTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setup() {
        activityActivityTestRule.activity
            .supportFragmentManager.beginTransaction().replace(
            R.id.container_main,
            ProfileFragment()
        ).addToBackStack(null).commit()
    }


    @Test
    fun testProfileMenuModifica() {
        onView(withId(R.id.threeDots_button)).check(matches((isDisplayed())))
        onView(withId(R.id.threeDots_button)).perform(click())
        onView(withText("Modifica")).check(matches((isDisplayed())))
        onView(withText("Modifica")).perform(click())
        onView(withId(R.id.nome_editText)).check(matches((isDisplayed())))
    }

    @Test
    fun testProfileMenuLogout() {
        onView(withId(R.id.threeDots_button)).check(matches((isDisplayed())))
        onView(withId(R.id.threeDots_button)).perform(click())
        onView(withText("Logout")).check(matches((isDisplayed())))
        onView(withText("Logout")).perform(click())
        onView(withId(R.id.fragment_login)).check(matches((isDisplayed())))
    }

    @Test
    fun testProfileDiventaAllenatoreoUtenteSemplice() {
        onView(withId(R.id.diventa_allenatore_button)).check(matches((isDisplayed())))
        onView(withId(R.id.diventa_allenatore_button)).perform(click())
        onView(withText("Annulla")).check(matches((isDisplayed())))
    }


    @Test
    fun testProfileScegliAllenatore() {
        onView(withId(R.id.profilo_selez_allen_layout)).check(matches((isDisplayed())))
        onView(withId(R.id.button_add_allenatore)).perform(click())
        onView(withId(R.id.fragment_allenatori)).check(matches((isDisplayed())))
    }

    @Test
    fun testProfileModificaAllenatore() {
        onView(withId(R.id.profilo_allenatore_cardview)).check(matches((isDisplayed())))
        onView(withId(R.id.threeDots_allenatore_button)).check(matches((isDisplayed())))
        onView(withId(R.id.threeDots_allenatore_button)).perform(click())
        onView(withText("Modifica")).check(matches((isDisplayed())))
        onView(withText("Modifica")).perform(click())
        onView(withId(R.id.fragment_allenatori)).check(matches((isDisplayed())))
    }

    @Test
    fun testProfileEliminaAllenatore() {
        onView(withId(R.id.profilo_allenatore_cardview)).check(matches((isDisplayed())))
        onView(withId(R.id.threeDots_allenatore_button)).check(matches((isDisplayed())))
        onView(withId(R.id.threeDots_allenatore_button)).perform(click())
        onView(withText("Elimina")).check(matches((isDisplayed())))
        onView(withText("Elimina")).perform(click())
        onView(withId(R.id.profilo_selez_allen_layout)).check(matches((isDisplayed())))
    }


    @Test
    fun testProfileScegliScheda() {
        onView(withId(R.id.profilo_selez_scheda_layout)).check(matches((isDisplayed())))
        onView(withId(R.id.button_add_scheda_attuale)).perform(click())
        onView(withId(R.id.fragment_schede)).check(matches((isDisplayed())))
    }

    @Test
    fun testProfileModificaScheda() {
        onView(withId(R.id.profilo_scheda_attuale_cardview)).check(matches((isDisplayed())))
        onView(withId(R.id.threeDots_scheda_button)).check(matches((isDisplayed())))
        onView(withId(R.id.threeDots_scheda_button)).perform(click())
        onView(withText("Modifica")).check(matches((isDisplayed())))
        onView(withText("Modifica")).perform(click())
        onView(withId(R.id.fragment_schede)).check(matches((isDisplayed())))
    }

    @Test
    fun testProfileEliminaScheda() {
        onView(withId(R.id.profilo_scheda_attuale_cardview)).check(matches((isDisplayed())))
        onView(withId(R.id.threeDots_scheda_button)).check(matches((isDisplayed())))
        onView(withId(R.id.threeDots_scheda_button)).perform(click())
        onView(withText("Elimina")).check(matches((isDisplayed())))
        onView(withText("Elimina")).perform(click())
        onView(withId(R.id.profilo_selez_scheda_layout)).check(matches((isDisplayed())))
    }


}
