<template>
  <v-app-bar dense color="primary lighten-2" dark app>
    <v-app-bar-nav-icon></v-app-bar-nav-icon>

    <v-toolbar-title>
      <v-select
        width="100"
        v-model="tenant"
        :items="tenants"
        item-text="name"
        item-value="code"
        label="Tenants"
        hide-details="auto"
        dense
        single-line
        @change="changeTenant()"
      ></v-select>
    </v-toolbar-title>

  </v-app-bar>
</template>

<script>
export default {
  data() {
    return {
      title: "My cars",
      tenant: "bmw",
      tenants: [
        { name: "BMW", code: "bmw" },
        { name: "Volkswagen", code: "vw" },
      ],
    };
  },
  methods: {
    changeTenant() {
      this.$emit("change-tenant", this.tenant);
    },
  },
};
</script>
