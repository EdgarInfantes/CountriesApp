import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.einfantesv.LogInScreen
import dev.einfantesv.SignUpScreen
import dev.einfantesv.core.navigation.Screens

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.Login.route) {
        composable(Screens.Login.route) { LogInScreen(navController) }
        composable(Screens.Home.route) { HomeScreen() }
        composable(Screens.SignUp.route) { SignUpScreen(navController) }
    }
}
