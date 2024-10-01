package ipca.example.calculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CalculatorScreen(modifier: Modifier = Modifier) {

    var text by remember {
        mutableStateOf("0")
    }

    Column(modifier = modifier
        .fillMaxSize()
        .padding(16.dp),
    ) {
        Text(text = text,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.TopEnd)
        )
        Row(modifier = Modifier.fillMaxWidth()) {
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "C")
            }
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "()")
            }
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "%")
            }
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "/")
            }
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Button(onClick = { text = "7" },
                modifier = Modifier.weight(1f)) {
                Text(text = "7")
            }
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "8")
            }
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "9")
            }
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "*")
            }
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "4")
            }
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "5")
            }
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "6")
            }
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "-")
            }
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "1")
            }
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "2")
            }
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "3")
            }
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "+")
            }
        }
        Row(modifier = Modifier.fillMaxWidth()) {
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "+/-")
            }
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "0")
            }
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = ".")
            }
            Button(onClick = { /* ToDo */ },
                modifier = Modifier.weight(1f)) {
                Text(text = "=")
            }
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun calculationScreenPreview() {
    CalculatorTheme {
        CalculatorScreen()
    }
}
*/