<template>
  <v-container>
    <h1>Nuevo carro</h1>
    <v-text-field v-model="nombre" label="Nombre"></v-text-field>
    <v-select
      v-model="color"
      :items="colores"
      item-text="nombre"
      item-value="codigo"
      label="Color"
      single-line
    >
      <v-icon slot="prepend" :color="color" @click="guardar()">
        mdi-checkbox-blank-circle
      </v-icon>
    </v-select>
    <div class="text-right mb-5">
      <v-btn color="primary" @click="guardar()">Guardar</v-btn>
    </div>
    <v-alert :type="alertType" v-model="alertShow">{{ alertMessage }}</v-alert>
  </v-container>
</template>

<script>
import { crearCarro } from "../controllers/Carro.controller";
export default {
  data() {
    return {
      nombre: "",
      color: "",
      colores: [
        { nombre: "Rojo", codigo: "red" },
        { nombre: "Rosa", codigo: "pink" },
        { nombre: "Violeta", codigo: "purple" },
        { nombre: "Azul", codigo: "blue" },
        { nombre: "Cyan", codigo: "cyan" },
        { nombre: "Verde", codigo: "green" },
        { nombre: "Amarillo", codigo: "yellow" },
        { nombre: "Naranja", codigo: "orange" },
        { nombre: "Cafe", codigo: "brown" },
        { nombre: "Gris", codigo: "gray" },
        { nombre: "Blanco", codigo: "white" },
        { nombre: "Negro", codigo: "black" },
      ],
      alertMessage: "",
      alertType: "info",
      alertShow: false,
    };
  },
  methods: {
    guardar() {
      const carro = {
        nombre: this.nombre,
        color: this.color,
      };
      crearCarro(carro)
        .then(() => this.openAlert("success", "Carro creado exitosamente!", "/"))
        .catch((error) =>
          this.openAlert("error", "Ha ocurrido un error: " + error.response)
        );
    },
    openAlert(type, message, routeUrl) {
      this.alertType = type;
      this.alertMessage = message;
      this.alertShow = true;
      setTimeout(() => {
        this.alertShow = false;
        if(routeUrl != undefined){
            this.$router.push(routeUrl);
        }
      }, 3000);
    },
  },
};
</script>

<style>
</style>