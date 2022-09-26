package alura.com.br.orgs.ui.activity

import alura.com.br.orgs.R
import alura.com.br.orgs.ui.recycler.adapter.ListaProdutoAdapetr
import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.setText("Cesta de frutas")
//
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Maça, uva, banana"
//
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"
        val recyclerView = findViewById<RecyclerView>(R.id.rvProduto)
        recyclerView.adapter = ListaProdutoAdapetr()





    }

}