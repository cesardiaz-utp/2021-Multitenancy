<template>
  <v-container>
    <h1>{{ name }}</h1>
    <v-btn color="primary" link to="/new" class="mb-5">Nuevo carro</v-btn>
    <v-row>
      <v-col v-for="carro in carros" :key="carro.id" lg="3" md="4" sm="6">
        <v-card>
          <v-icon :color="carro.color" size="150">mdi-car</v-icon>
          <v-card-title>{{ carro.nombre }}</v-card-title>
          <v-card-subtitle>{{ carro.color }}</v-card-subtitle>
        </v-card>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
import { listarCarros } from "../controllers/Carro.controller";

export default {
  data() {
    return {
      name: "Listado de carros",
      carros: [],
    };
  },
  created() {
    listarCarros()
    .then(response => {
      this.carros = response.data;
    })
  },
};
</script>
