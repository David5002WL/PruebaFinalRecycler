package com.example.david.pruebafinalrecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by David on 30/01/2018.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.UsuarioviewHolder> {

    List<Usuario> listausuario;

    public Adaptador(List<Usuario> listausuario) {
        this.listausuario = listausuario;
    }

    @Override
    public UsuarioviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.plantilla, parent, false);
        UsuarioviewHolder holder = new UsuarioviewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(UsuarioviewHolder holder, int position) {
        holder.imagen.setImageResource(listausuario.get(position).getFoto());
        holder.textNombre.setText(listausuario.get(position).getNombre());
    }

    @Override
    public int getItemCount() {
        return listausuario.size();
    }

    public static class UsuarioviewHolder extends RecyclerView.ViewHolder{

        ImageView imagen;
        TextView textNombre;

        public UsuarioviewHolder(View itemView){
            super(itemView);

            imagen = (ImageView) itemView.findViewById(R.id.imagen);
            textNombre = (TextView) itemView.findViewById(R.id.textNombre);

        }
    }
}
