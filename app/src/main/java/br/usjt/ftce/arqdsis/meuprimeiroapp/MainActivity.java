package br.usjt.ftce.arqdsis.meuprimeiroapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText mensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mensagem=(EditText)findViewById(R.id.txt_mensagem);
    }
    public static final String MENSAGEM = "br.usjt.ftce.arqdsis.meuprimeiroapp.mensagem";
    public void enviar(View view){
        String texto = mensagem.getText().toString();
        Intent intent = new Intent(this, MensagemActivity.class);
        intent.putExtra(MENSAGEM, texto);
        startActivity(intent);
    }
}
