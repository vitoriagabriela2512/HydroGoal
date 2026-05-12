package br.ulbra.hydrogoal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etPeso, etIdade, etAgua;
    TextView txRes;
    Button btCalcular, btSedentario, btModerado, btIntenso;

    int extra = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Ligando componentes
        etPeso = findViewById(R.id.edtPeso);
        etIdade = findViewById(R.id.edtIdade);
        etAgua = findViewById(R.id.edtAgua);

        btCalcular = findViewById(R.id.btnCalcular);
        btSedentario = findViewById(R.id.btnSedentario);
        btModerado = findViewById(R.id.btnModerado);
        btIntenso = findViewById(R.id.btnIntenso);

        txRes = findViewById(R.id.txtRes);

        // Botão sedentário
        btSedentario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extra = 0;
            }
        });

        // Botão moderado
        btModerado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extra = 300;
            }
        });

        // Botão intenso
        btIntenso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extra = 600;
            }
        });

        // Botão calcular
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String pesoTexto = etPeso.getText().toString();
                String idadeTexto = etIdade.getText().toString();
                String aguaTexto = etAgua.getText().toString();

                // Verificação
                if (pesoTexto.isEmpty() || idadeTexto.isEmpty() || aguaTexto.isEmpty()) {
                    txRes.setText("Preencha todos os campos!");
                    return;
                }

                double peso = Double.parseDouble(pesoTexto);
                int idade = Integer.parseInt(idadeTexto);
                double aguaConsumida = Double.parseDouble(aguaTexto);

                // Validação
                if (peso <= 0 || idade <= 0) {
                    txRes.setText("Peso e idade devem ser maiores que 0!");
                    return;
                }

                // Cálculo
                double consumoTotal = (peso * 35) + extra;

                double restante = consumoTotal - aguaConsumida;

                // Evita negativo
                if (restante < 0) {
                    restante = 0;
                }

                // Resultado
                txRes.setText(
                        "Meta diária: " + consumoTotal + " ml\n" +
                                "Faltam: " + restante + " ml"
                );
            }
        });
    }
}