package com.example.jetpack_compose_assignment_1

import CourseListScreen
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_compose_assignment_1.model.Course
import com.example.jetpack_compose_assignment_1.ui.theme.Jetpackcomposeassignment1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jetpackcomposeassignment1Theme {

                Surface  (modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    val courses = listOf(
                        Course("Data Structures", "CS201", 3, "Study of linear and non-linear structures.", "Intro to CS"),
                        Course("Operating Systems", "CS301", 4, "Exploration of OS principles.", "CS201"),
                        Course("Computer Networks", "CS310", 3, "Study of protocols, architecture, and routing in computer networks.", "CS201"),
                        Course("Database Systems", "CS320", 3, "Design and use of relational databases.", "CS201"),
                        Course("Algorithms", "CS303", 4, "Advanced problem-solving techniques.", "CS201"),
                        Course("Software Engineering", "CS340", 3, "Introduction to software development processes.", "CS201"),
                        Course("Machine Learning", "CS450", 4, "Principles and algorithms for learning from data.", "CS303"),
                        Course("Artificial Intelligence", "CS460", 4, "Concepts of intelligent agents and reasoning.", "CS303"),
                        Course("Mobile App Development", "CS370", 3, "Building applications for mobile platforms.", "CS201"),
                        Course("Cybersecurity Fundamentals", "CS330", 3, "Principles of secure computing and cryptography.", "CS201"),
                        Course("Human-Computer Interaction", "CS355", 3, "Design and evaluation of user interfaces.", "CS201"),
                        Course("Cloud Computing", "CS420", 3, "Introduction to cloud platforms and services.", "CS310"),
                        Course("Parallel Programming", "CS405", 4, "Techniques for parallel algorithm design.", "CS301"),
                        Course("Compiler Design", "CS404", 4, "Translation of high-level languages to machine code.", "CS303"),
                        Course("Web Development", "CS360", 3, "Front-end and back-end web technologies.", "CS201"),
                        Course("Computer Graphics", "CS325", 3, "Generating and manipulating images.", "CS201"),
                        Course("Theory of Computation", "CS307", 4, "Formal languages, automata, and Turing machines.", "CS201"),
                        Course("Embedded Systems", "CS435", 3, "Design of microcontroller-based systems.", "CS301"),
                        Course("Big Data Analytics", "CS470", 3, "Techniques for analyzing large datasets.", "CS320"),
                        Course("Natural Language Processing", "CS480", 3, "Understanding and processing human languages.", "CS450")


                    )
                    CourseListScreen(courses)
                }

            }

        }
    }
}



@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DarkCourseCardPreview() {
    Jetpackcomposeassignment1Theme {
        CourseCard(
            Course("Artificial Intelligence", "CS401", 4, "Introduction to AI methods.", "Math & DS")

        )
    }
}
