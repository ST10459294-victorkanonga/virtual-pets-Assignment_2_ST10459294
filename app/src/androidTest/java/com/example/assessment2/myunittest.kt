package com.example.assessment2

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matcher
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class DogpageActivityTest {

    @Before
    fun setup() {
        ActivityScenario.launch(DogpageActivity::class.java)
    }

    @Test
    fun testFeedButtonClicked() {
        onView(withId(R.id.feedbutton)).perform(click())

        // Check if the image status changes to dogeating
        onView(withId(R.id.dogimagestatus)).check(matches(withDrawable(R.drawable.dogeating)))

        // Add more assertions as needed for other UI elements and functionality
    }

    @Test
    fun testPlayButtonClicked() {
        onView(withId(R.id.playbutton)).perform(click())

        // Check if the image status changes to dogplaying
        onView(withId(R.id.dogimagestatus)).check(matches(withDrawable(R.drawable.dogplaying)))

        // Add more assertions as needed for other UI elements and functionality
    }

    @Test
    fun testCleanButtonClicked() {
        onView(withId(R.id.cleanbutton)).perform(click())

        // Check if the image status changes to dogcleaning
        onView(withId(R.id.dogimagestatus)).check(matches(withDrawable(R.drawable.dogcleaning)))

        // Add more assertions as needed for other UI elements and functionality
    }

    // Custom matcher for checking if an ImageView has a certain drawable resource
    private fun withDrawable(resourceId: Int): Matcher<in View>? = DrawableMatcher(resourceId)
}
