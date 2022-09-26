package alura.com.br.orgs.ui.recycler.adapter

import alura.com.br.orgs.model.Produto
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListaProdutoAdapetr(
    private val produto : List<Produto>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = produto.size

}
