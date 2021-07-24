<script>
  import { onMount } from 'svelte';

  let homePage = "Home Page";
  let orderItem = [];

  onMount(async () => {
      const res = await fetch(`http://localhost:8080/salesOrders`, { mode: 'cors' });
      orderItem = await res.json();
  })

</script>

<div class="sales-items">
  {#each orderItem as item}
    <div class="sales-item">
      <h2>This is {homePage}</h2>
      <h3>{item.name}</h3>
      <p>{item.price}</p>
    </div>
  {/each}
</div>

<style>
  .sales-items {
    display: flex;
    justify-content: center;
  }
  .sales-item {
    margin: 1em;
  }
</style>
