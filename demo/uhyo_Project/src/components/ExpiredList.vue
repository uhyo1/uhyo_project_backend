<script setup>
import { ref, onMounted } from 'vue'
import axios from 'axios'

const items = ref([])

onMounted(async () => {
  const res = await axios.get('http://localhost:8080/expired/all')
  items.value = res.data
})
</script>

<template>
  <div>
    <h2>Expired Password List</h2>
    <ul>
      <li v-for="item in items" :key="item.id">
        {{ item.userId }} - {{ item.accessInfo }} - {{ item.password }}
      </li>
    </ul>
  </div>
</template>