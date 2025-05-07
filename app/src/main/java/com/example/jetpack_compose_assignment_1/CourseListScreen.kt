import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_assignment_1.CourseCard
import com.example.jetpack_compose_assignment_1.model.Course
import java.lang.reflect.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.padding

@Composable
fun CourseListScreen(
    courses: List<Course>
) {
    LazyColumn (

    ) {
        items(courses) { course ->
            CourseCard(course = course)
        }
    }
}
