<script>
  import { Router, Link, Route } from "svelte-routing";
  import Home from "./routes/Home.svelte";
  import Info from "./routes/Info.svelte";
  export let location;
</script>

<main>
  <Router>
    <nav>
      <Link to="/">Home</Link>
      <Link to="/info">Info</Link>
    </nav>
    <div>
      <Route path="/" component="{Home}"/>
      <Route path="/info" component="{Info}"/>
    </div>
  </Router>
</main>

<style>
  main {
    text-align: center;
    padding: 1em;
    max-width: 240px;
    margin: 0 auto;
  }

  @media (min-width: 640px) {
    main {
      max-width: none;
    }
  }
</style>
