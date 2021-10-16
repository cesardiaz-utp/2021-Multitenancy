<template>
  <v-app>
    <my-header></my-header>

    <!-- Sizes your content based upon application components -->
    <v-main>
      <!-- Provides the application the proper gutter -->
      <v-container fluid>
        <!-- If using vue-router -->
        <router-view></router-view>
      </v-container>
    </v-main>

    <my-footer></my-footer>
  </v-app>
</template>

<script>
import MyHeader from "./components/Header.vue";
import MyFooter from "./components/Footer.vue";

export default {
  name: "App",
  components: {
    MyHeader,
    MyFooter,
  },
  data: () => ({
    //
  }),
};
</script>
