package ipca.example.calculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ipca.example.calculator.ui.theme.Gray
import ipca.example.calculator.ui.theme.Pink40
import ipca.example.calculator.ui.theme.components.ButtonType
import ipca.example.calculator.ui.theme.components.CalcButton

@Preview
@Composable
fun CalculatorScreen(modifier: Modifier = Modifier) {

    var text by remember {
        mutableStateOf("0")
    }

    val onNumPress : (String) -> Unit = {
        if (text == "0") {
            text = it
        } else {
            text += it
        }
    }

    Column(modifier = modifier
        .fillMaxSize()
        .padding(16.dp),
    ) {
        Text(text = text,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
                //.padding(top = 16.dp, bottom = 16.dp),
                //.wrapContentSize(Alignment.TopEnd)
            textAlign = TextAlign.End,
            style = MaterialTheme.typography.titleLarge
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .height(50.dp),
        ) {
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "C",
                type = ButtonType.Special,
                onClick = { /* ToDo */ }
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "()",
                type = ButtonType.Special,
                onClick = { /* ToDo */ }
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "%",
                type = ButtonType.Special,
                onClick = { /* ToDo */ }
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "/",
                type = ButtonType.Operator,
                onClick = { /* ToDo */ }
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
        ) {
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "7",
                onClick = onNumPress
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "8",
                onClick = onNumPress
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "9",
                onClick = onNumPress
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "*",
                type = ButtonType.Operator,
                onClick = { /* ToDo */ }
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
        ) {
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "4",
                onClick = onNumPress
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "5",
                onClick = onNumPress
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "6",
                onClick = onNumPress
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "-",
                type = ButtonType.Operator,
                onClick = { /* ToDo */ }
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
        ) {
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "1",
                onClick = onNumPress
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "2",
                onClick = onNumPress
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "3",
                onClick = onNumPress
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "+",
                type = ButtonType.Operator,
                onClick = { /* ToDo */ }
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
        ) {
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "+/-",
                onClick = { /* ToDo */ }
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "0",
                onClick = onNumPress
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = ".",
                onClick = { /* ToDo */ }
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "()",
                type = ButtonType.Operator,
                onClick = { /* ToDo */ }
            )
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