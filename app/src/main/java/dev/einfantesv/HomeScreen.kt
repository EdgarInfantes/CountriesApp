// Importaciones necesarias
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import dev.einfantesv.R

// Modelo de datos para cada país
data class Country(val name: String, val rank: Int, val flagRes: Int)

@Composable
fun HomeScreen() {
    // Lista de países
    val countries = listOf(
        Country("Brasil", 1, R.drawable.brasil),
        Country("Argentina", 2, R.drawable.argentina),
        Country("Francia", 3, R.drawable.francia)
    )

    // Contenedor principal
    Column(
        modifier  = Modifier.fillMaxSize().padding(26.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Título centrado
        Text(
            text = "Ranking FIFA",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            style = MaterialTheme.typography.headlineLarge
        )

        // Lista de Cards utilizando LazyColumn
        LazyColumn {
            items(countries) { country ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        // Imagen del país
                        Image(
                            painter = painterResource(id = country.flagRes),
                            contentDescription = country.name,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(8.dp))
                        )

                        // Separador entre imagen y texto
                        Spacer(modifier = Modifier.width(16.dp))

                        // Nombre y Ranking del Pais
                        Column(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = country.name,
                                style = MaterialTheme.typography.titleLarge
                            )
                            Text(
                                text = "Ranking FIFA: ${country.rank}",
                                style = MaterialTheme.typography.titleLarge
                            )
                        }
                    }
                }
            }
        }
    }
}
