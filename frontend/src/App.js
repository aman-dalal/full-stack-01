import React, { useEffect, useState } from 'react';

function App() {
  const [assets, setAssets] = useState([]);

  useEffect(() => {
    fetch('/api/assets')
      .then(res => res.json())
      .then(setAssets);
  }, []);

  return (
    <div>
      <h1>Assets</h1>
      <ul>
        {assets.map(a => (
          <li key={a.assetId}>{a.assetName}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
